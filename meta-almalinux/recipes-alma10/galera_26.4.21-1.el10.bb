
inherit dnf-bridge

PN = "galera"
PE = "0"
PV = "26.4.21"
PR = "1.el10"
PACKAGES = "galera"


URI_galera = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/galera-26.4.21-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:galera = " \
 shadow-utils \
 systemd \
 nmap-ncat \
 boost-program-options \
 libgcc \
 openssl-libs \
 libstdc++ \
 bash \
 procps-ng \
 glibc \
"
