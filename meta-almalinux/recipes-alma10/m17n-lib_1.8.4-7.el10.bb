
PN = "m17n-lib"
PE = "0"
PV = "1.8.4"
PR = "7.el10"
PACKAGES = "m17n-lib m17n-lib-devel m17n-lib-tools"


URI_m17n-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/m17n-lib-1.8.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:m17n-lib = "
 zlib-ng-compat
 libxml2
 glibc
 m17n-db
 libthai
 xz-libs
"

URI_m17n-lib-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/m17n-lib-devel-1.8.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:m17n-lib-devel = "
 m17n-lib-tools
 pkgconf-pkg-config
 m17n-lib
"

URI_m17n-lib-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/m17n-lib-tools-1.8.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:m17n-lib-tools = "
 gd
 zlib-ng-compat
 freetype
 libXft
 libotf
 fribidi
 libICE
 libxml2
 fontconfig
 libSM
 libX11
 libXt
 libXaw
 glibc
 m17n-db-extras
 libthai
 xz-libs
 m17n-lib
"
