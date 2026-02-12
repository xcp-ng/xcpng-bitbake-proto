
inherit dnf-bridge

PN = "rpm-mpi-hooks"
PE = "0"
PV = "8"
PR = "10.el10"
PACKAGES = "rpm-mpi-hooks"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rpm-mpi-hooks-8-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rpm-mpi-hooks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-mpi-hooks-8-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rpm-mpi-hooks}"
RDEPENDS:rpm-mpi-hooks = " \
 environment-modules \
 filesystem \
 bash \
"
