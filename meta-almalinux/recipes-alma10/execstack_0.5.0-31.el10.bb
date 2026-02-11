
PN = "execstack"
PE = "0"
PV = "0.5.0"
PR = "31.el10"
PACKAGES = "execstack"


URI_execstack = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/execstack-0.5.0-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:execstack = " \
 coreutils \
 util-linux \
 gawk \
 grep \
 elfutils-libelf \
 glibc \
 libselinux \
 findutils \
"
