
inherit dnf-bridge

PN = "convmv"
PE = "0"
PV = "2.05"
PR = "18.el10"
PACKAGES = "convmv"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/convmv-2.05-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_convmv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/convmv-2.05-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_convmv}"
RDEPENDS:convmv = " \
 perl-libs \
 perl-Unicode-Normalize \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-Encode \
 perl-File-Compare \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
"
