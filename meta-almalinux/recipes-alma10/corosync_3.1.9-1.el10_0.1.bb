
PN = "corosync"
PE = "0"
PV = "3.1.9"
PR = "1.el10_0.1"
PACKAGES = "corosynclib corosync-vqsim"


URI_corosynclib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/corosynclib-3.1.9-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:corosynclib = " \
 glibc \
 libqb \
"

URI_corosync-vqsim = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/corosync-vqsim-3.1.9-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:corosync-vqsim = " \
 libqb \
 libknet1 \
 corosynclib \
 readline \
 pkgconf-pkg-config \
 glibc \
"
