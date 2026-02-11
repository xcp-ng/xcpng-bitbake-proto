
inherit dnf-bridge

PN = "kernel-srpm-macros"
PE = "0"
PV = "1.0"
PR = "25.el10"
PACKAGES = "kernel-rpm-macros kernel-srpm-macros"


URI_kernel-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kernel-rpm-macros-205-25.el10.noarch.rpm;unpack=0"
RDEPENDS:kernel-rpm-macros = " \
 redhat-rpm-config \
 kmod \
 gawk \
 grep \
 bash \
 xz \
 binutils \
 sed \
 perl-interpreter \
 findutils \
"

URI_kernel-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kernel-srpm-macros-1.0-25.el10.noarch.rpm;unpack=0"
RDEPENDS:kernel-srpm-macros = ""
