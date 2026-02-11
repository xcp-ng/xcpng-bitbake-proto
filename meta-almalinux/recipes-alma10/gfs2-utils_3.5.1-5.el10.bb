
PN = "gfs2-utils"
PE = "0"
PV = "3.5.1"
PR = "5.el10"
PACKAGES = "gfs2-utils"


URI_gfs2-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gfs2-utils-3.5.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gfs2-utils = "
 libuuid
 zlib-ng-compat
 bzip2-libs
 libblkid
 bash
 ncurses-libs
 glibc
"
