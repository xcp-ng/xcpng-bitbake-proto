
inherit dnf-bridge

PN = "openmpi"
PE = "2"
PV = "5.0.2"
PR = "5.el10"
PACKAGES = "openmpi openmpi-devel openmpi-java python3-openmpi openmpi-doc openmpi-java-devel"


URI_openmpi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openmpi-5.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openmpi = " \
 prrte \
 openssh-clients \
 libevent \
 libgcc \
 libgfortran \
 libquadmath \
 hwloc-libs \
 environment-modules \
 libfabric \
 ucx \
 pmix \
 glibc \
"

URI_openmpi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openmpi-devel-5.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openmpi-devel = " \
 python3 \
 openmpi \
 pkgconf-pkg-config \
 rpm-mpi-hooks \
 pmix \
 glibc \
 gcc-gfortran \
"

URI_openmpi-java = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openmpi-java-5.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openmpi-java = " \
 java-21-openjdk-headless \
 openmpi \
"

URI_python3-openmpi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-openmpi-5.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-openmpi = " \
 python3 \
 openmpi \
"

URI_openmpi-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openmpi-doc-5.0.2-5.el10.noarch.rpm;unpack=0"
RDEPENDS:openmpi-doc = ""

URI_openmpi-java-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openmpi-java-devel-5.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openmpi-java-devel = " \
 openmpi-java \
 perl-interpreter \
 perl-libs \
 java-21-openjdk-devel \
"
