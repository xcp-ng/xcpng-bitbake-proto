
inherit dnf-bridge

PN = "rasdaemon"
PE = "0"
PV = "0.8.0"
PR = "8.el10"
PACKAGES = "rasdaemon"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rasdaemon-0.8.0-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rasdaemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rasdaemon-0.8.0-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rasdaemon}"
RDEPENDS:rasdaemon = " \
 perl-constant \
 systemd \
 perl-libs \
 dmidecode \
 perl-Getopt-Long \
 perl-POSIX \
 perl-File-Basename \
 sqlite-libs \
 hwdata \
 perl-File-Find \
 perl-DBD-SQLite \
 glibc \
 perl-interpreter \
 libtraceevent \
"
