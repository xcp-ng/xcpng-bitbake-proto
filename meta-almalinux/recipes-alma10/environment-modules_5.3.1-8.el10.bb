
inherit dnf-bridge

PN = "environment-modules"
PE = "0"
PV = "5.3.1"
PR = "8.el10"
PACKAGES = "environment-modules"


URI_environment-modules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/environment-modules-5.3.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:environment-modules = " \
 less \
 tcl \
 man-db \
 vim-filesystem \
 bash \
 procps-ng \
 glibc \
 coreutils \
 sed \
 alternatives \
"
