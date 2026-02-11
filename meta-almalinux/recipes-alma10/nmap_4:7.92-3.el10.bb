
PN = "nmap"
PE = "4"
PV = "7.92"
PR = "3.el10"
PACKAGES = "nmap nmap-ncat"


URI_nmap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nmap-7.92-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nmap = " \
 libpcap \
 zlib-ng-compat \
 nmap-ncat \
 openssl-libs \
 libgcc \
 libstdc++ \
 pcre2 \
 glibc \
"

URI_nmap-ncat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nmap-ncat-7.92-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nmap-ncat = " \
 libpcap \
 openssl-libs \
 bash \
 glibc \
 alternatives \
"
