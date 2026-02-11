
PN = "libnetfilter_queue"
PE = "0"
PV = "1.0.5"
PR = "9.el10"
PACKAGES = "libnetfilter_queue libnetfilter_queue-devel"


URI_libnetfilter_queue = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnetfilter_queue-1.0.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_queue = " \
 glibc \
 libmnl \
 libnfnetlink \
"

URI_libnetfilter_queue-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnetfilter_queue-devel-1.0.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_queue-devel = " \
 libnfnetlink-devel \
 kernel-headers \
 pkgconf-pkg-config \
 libnetfilter_queue \
"
