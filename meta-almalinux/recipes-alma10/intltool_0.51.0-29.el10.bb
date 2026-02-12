
inherit dnf-bridge

PN = "intltool"
PE = "0"
PV = "0.51.0"
PR = "29.el10"
PACKAGES = "intltool"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/intltool-0.51.0-29.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_intltool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/intltool-0.51.0-29.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_intltool}"
RDEPENDS:intltool = " \
 patch \
 perl-libs \
 automake \
 perl-Text-Tabs+Wrap \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-Encode \
 perl-XML-Parser \
 perl-File-Copy \
 bash \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
 gettext-devel \
"
