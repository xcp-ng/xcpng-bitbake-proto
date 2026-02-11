
PN = "mcstrans"
PE = "0"
PV = "3.8"
PR = "1.el10"
PACKAGES = "mcstrans"


URI_mcstrans = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mcstrans-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mcstrans = " \
 systemd \
 libcap \
 bash \
 pcre2 \
 glibc \
 libselinux \
"
