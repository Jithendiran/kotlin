


#git commit -m '$data'
#git add *.kt
#git push -u origin main



if [ ! -z "$(git ls-files --other --modified --exclude-standard)" -o ! -z "$(git diff --name-only)" ]
then
    # check any file modified or new file created

    #if new file added 
    if [ ! -z "$(git ls-files --other --modified --exclude-standard)" ]
    then
        # add file
        echo "in add"
        echo "$(git ls-files --other --modified --exclude-standard)"
        for i in $(git ls-files -o  --exclude-standard --full-name)
        do      
        
        if [[ $i == *.kt ]]
        then
            #check if any file with extension .kt if there add it to the repo
        echo "yes"
        echo $i
        #data='$i" added"'
        git add *.kt
        echo "file added"
        break
        echo "after break"
        fi

    #if file where deleted 

    ######################to-do check always give a.kt

 #       if [ ! -z "$(git log --diff-filter=D --name-only --pretty="")" ] 
 #       then
 #           echo "$(git log --diff-filter=D --name-only --pretty="")"
#
 #           for i in $(git log --diff-filter=D --name-only --pretty="")
 #           do
 #               #git rm -f $i
 #               echo "$i removed"
#
 #           done
 #       
 #       fi


    #if file modified

        if [ ! -z "$(git diff --name-only)" ] 
        then
            echo "$(git diff --name-only)"

            for i in $(git diff --name-only)
            do
                git add $i
                echo "$i added"

            done
        
        fi


        done
    fi
    
    # commit the changes
    if [ -z "$1" ]
    then
        #if no message then automatically add date nad time as msg 
        #echo "backup"
        data="backup_'$(date)'"
    
    else
        #echo $1
        data=$1
    fi

    git commit -m "$data"
    echo "data committed"


else
    echo "not modified"
    data="up to dated"
    notify-send "$data"
fi

#if [ ! -z "$(git ls-files --other --modified --exclude-standard)" ] # check staged file
#then
#    echo "yes"
#else
#    echo " no"
#fi


echo $data
notify-send "Data Commited $data"