
PN = "rng-tools"
PE = "0"
PV = "6.17"
PR = "4.el10"
PACKAGES = "rng-tools"


URI_rng-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rng-tools-6.17-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rng-tools = " \
 systemd \
 jansson \
 jitterentropy \
 openssl-libs \
 libcap \
 bash \
 libcurl \
 glibc \
 selinux-policy \
"
