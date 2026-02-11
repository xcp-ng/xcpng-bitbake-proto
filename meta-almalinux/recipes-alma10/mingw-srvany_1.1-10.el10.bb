
PN = "mingw-srvany"
PE = "0"
PV = "1.1"
PR = "10.el10"
PACKAGES = "mingw-srvany-redistributable mingw32-srvany"


URI_mingw-srvany-redistributable = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mingw-srvany-redistributable-1.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw-srvany-redistributable = ""

URI_mingw32-srvany = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-srvany-1.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-srvany = "
 mingw32-crt
 mingw32-filesystem
"
