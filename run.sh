cflags=$(pkg-config --cflags gtk4 | tr -d '\n' | xargs -d ' ' -I{} printf "--native-compile '{}' ")
linkflags=$(pkg-config --libs gtk4| tr -d '\n' | xargs -d ' ' -I{} printf "--native-linking '{}' ")

echo $cflags
echo $linkflags

cmd="scala-cli run . --native $cflags $linkflags"
echo $cmd
# $($cmd)
