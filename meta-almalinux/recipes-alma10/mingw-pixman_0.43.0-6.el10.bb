
PN = "mingw-pixman"
PE = "0"
PV = "0.43.0"
PR = "6.el10"
PACKAGES = "mingw32-pixman mingw64-pixman mingw32-pixman-static mingw64-pixman-static"


URI_mingw32-pixman = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-pixman-0.43.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-pixman = "
 mingw32-crt
 mingw32-filesystem
 mingw32-libgcc
"

URI_mingw64-pixman = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-pixman-0.43.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-pixman = "
 mingw64-crt
 mingw64-filesystem
 mingw64-libgcc
"

URI_mingw32-pixman-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-pixman-static-0.43.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-pixman-static = "
 mingw32-pixman
"

URI_mingw64-pixman-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-pixman-static-0.43.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-pixman-static = "
 mingw64-pixman
"
