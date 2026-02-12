
inherit dnf-bridge

PN = "netpbm"
PE = "0"
PV = "11.09.00"
PR = "1.el10"
PACKAGES = "netpbm netpbm-progs netpbm-devel netpbm-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/netpbm-11.09.00-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_netpbm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/netpbm-11.09.00-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_netpbm}"
RDEPENDS:netpbm = " \
 glibc \
"

URI_netpbm-progs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/netpbm-progs-11.09.00-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_netpbm-progs}"
RDEPENDS:netpbm-progs = " \
 perl-libs \
 libpng \
 jasper-libs \
 perl-Getopt-Long \
 libX11 \
 perl-IO \
 jbigkit-libs \
 zlib-ng-compat \
 libgcc \
 netpbm \
 libxml2 \
 bash \
 perl-English \
 perl-Errno \
 ghostscript \
 perl-Fcntl \
 perl-File-Basename \
 perl-File-Copy \
 perl-PathTools \
 glibc \
 perl-interpreter \
 libjpeg-turbo \
 perl-File-Temp \
 libtiff \
"

URI_netpbm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/netpbm-devel-11.09.00-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_netpbm-devel}"
RDEPENDS:netpbm-devel = " \
 netpbm \
"

URI_netpbm-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/netpbm-doc-11.09.00-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_netpbm-doc}"
RDEPENDS:netpbm-doc = " \
 netpbm-progs \
"
