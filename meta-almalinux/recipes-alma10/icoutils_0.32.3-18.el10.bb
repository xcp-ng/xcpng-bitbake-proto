
inherit dnf-bridge

PN = "icoutils"
PE = "0"
PV = "0.32.3"
PR = "18.el10"
PACKAGES = "icoutils"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/icoutils-0.32.3-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_icoutils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/icoutils-0.32.3-18.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_icoutils}"
RDEPENDS:icoutils = " \
 libpng \
 perl-libwww-perl \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-PathTools \
 glibc \
 perl-HTTP-Message \
 perl-interpreter \
 perl-Term-ReadLine \
"
