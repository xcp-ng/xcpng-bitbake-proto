
PN = "liblerc"
PE = "0"
PV = "4.0.0"
PR = "8.el10"
PACKAGES = "liblerc liblerc-devel mingw32-liblerc mingw64-liblerc"


URI_liblerc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblerc-4.0.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblerc = "
 glibc
 libgcc
 libstdc++
"

URI_liblerc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liblerc-devel-4.0.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblerc-devel = "
 liblerc
 pkgconf-pkg-config
"

URI_mingw32-liblerc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-liblerc-4.0.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-liblerc = "
 mingw32-libstdc++
 mingw32-crt
 mingw32-filesystem
 mingw32-libgcc
"

URI_mingw64-liblerc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-liblerc-4.0.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-liblerc = "
 mingw64-libstdc++
 mingw64-crt
 mingw64-filesystem
 mingw64-libgcc
"
