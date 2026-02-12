
inherit dnf-bridge

PN = "man-db"
PE = "0"
PV = "2.12.0"
PR = "8.el10"
PACKAGES = "man-db man-db-cron"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/man-db-2.12.0-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_man-db = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/man-db-2.12.0-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_man-db}"
RDEPENDS:man-db = " \
 coreutils \
 less \
 zlib-ng-compat \
 libpipeline \
 gzip \
 grep \
 gdbm-libs \
 groff-base \
 bash \
 glibc \
 alternatives \
"

URI_man-db-cron = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/man-db-cron-2.12.0-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_man-db-cron}"
RDEPENDS:man-db-cron = " \
 crontabs \
 bash \
 man-db \
"
