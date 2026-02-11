
PN = "container-selinux"
PE = "4"
PV = "2.235.0"
PR = "2.el10_0"
PACKAGES = "container-selinux"


URI_container-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/container-selinux-2.235.0-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:container-selinux = " \
 policycoreutils \
 bash \
 selinux-policy-minimum \
 sed \
 selinux-policy \
 libselinux-utils \
"
