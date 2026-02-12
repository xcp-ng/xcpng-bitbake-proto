
inherit dnf-bridge

PN = "help2man"
PE = "0"
PV = "1.49.3"
PR = "7.el10"
PACKAGES = "help2man"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/help2man-1.49.3-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_help2man = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/help2man-1.49.3-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_help2man}"
RDEPENDS:help2man = " \
 perl-libs \
 perl-Text-ParseWords \
 perl-Text-Tabs+Wrap \
 perl-Getopt-Long \
 perl-POSIX \
 perl-interpreter \
"
