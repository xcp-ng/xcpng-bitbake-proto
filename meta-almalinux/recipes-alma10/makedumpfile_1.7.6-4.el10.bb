
PN = "makedumpfile"
PE = "0"
PV = "1.7.6"
PR = "4.el10"
PACKAGES = "makedumpfile"


URI_makedumpfile = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/makedumpfile-1.7.6-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:makedumpfile = " \
 zlib-ng-compat \
 lzo \
 libgcc \
 snappy \
 elfutils-libelf \
 libzstd \
 elfutils-libs \
 ncurses-libs \
 glibc \
"
