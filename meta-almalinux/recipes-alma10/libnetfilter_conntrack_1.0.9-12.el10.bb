
PN = "libnetfilter_conntrack"
PE = "0"
PV = "1.0.9"
PR = "12.el10"
PACKAGES = "libnetfilter_conntrack libnetfilter_conntrack-devel"


URI_libnetfilter_conntrack = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnetfilter_conntrack-1.0.9-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_conntrack = " \
 glibc \
 libmnl \
 libnfnetlink \
"

URI_libnetfilter_conntrack-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnetfilter_conntrack-devel-1.0.9-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_conntrack-devel = " \
 libnfnetlink-devel \
 libnetfilter_conntrack \
 kernel-headers \
 pkgconf-pkg-config \
"
