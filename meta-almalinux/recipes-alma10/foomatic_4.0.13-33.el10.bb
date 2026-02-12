
inherit dnf-bridge

PN = "foomatic"
PE = "0"
PV = "4.0.13"
PR = "33.el10"
PACKAGES = "foomatic"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/foomatic-4.0.13-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_foomatic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/foomatic-4.0.13-33.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_foomatic}"
RDEPENDS:foomatic = " \
 perl-libs \
 perl-FileHandle \
 perl-Getopt-Long \
 perl-Getopt-Std \
 foomatic-db \
 dbus \
 cups \
 cups-filters \
 perl-vars \
 perl-Data-Dumper \
 libxml2 \
 perl-Encode \
 bash \
 perl-Exporter \
 ghostscript \
 perl-POSIX \
 colord \
 perl-PathTools \
 glibc \
 coreutils \
 perl-interpreter \
"
