
inherit dnf-bridge

PN = "libpaper"
PE = "1"
PV = "2.1.1"
PR = "7.el10"
PACKAGES = "libpaper libpaper-devel paper"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libpaper-2.1.1-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libpaper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpaper-2.1.1-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpaper}"
RDEPENDS:libpaper = " \
 glibc \
"

URI_libpaper-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libpaper-devel-2.1.1-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpaper-devel}"
RDEPENDS:libpaper-devel = " \
 libpaper \
"

URI_paper = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/paper-2.1.1-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_paper}"
RDEPENDS:paper = " \
 glibc \
 libpaper \
"
