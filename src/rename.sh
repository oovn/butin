#ls -d ./*/ > dirname.txt

while read d; do
  #echo "$d"java/win/lamit/butin/conversations
#mkdir "$d"java/win
#mkdir "$d"java/win/lamit
#mkdir "$d"/java/win/lamit/butin
#mv -v "$d"java/win/lamit/butin/conversations/* "$d"java/win/lamit/butin
#rm -rf "$d"java/win/lamit/butin/conversations
rm -rf "$d"java/eu

done <dirname.txt
