
inherit dnf-bridge

PN = "dyninst"
PE = "0"
PV = "12.3.0"
PR = "8.el10"
PACKAGES = "dyninst dyninst-devel dyninst-doc dyninst-testsuite"


URI_dyninst = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dyninst-12.3.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dyninst = " \
 boost-filesystem \
 elfutils-debuginfod-client \
 libgcc \
 elfutils-libelf \
 libgomp \
 elfutils-libs \
 boost-thread \
 libstdc++ \
 glibc \
 tbb \
"

URI_dyninst-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dyninst-devel-12.3.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dyninst-devel = " \
 cmake-filesystem \
 tbb-devel \
 dyninst \
 boost-devel \
"

URI_dyninst-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dyninst-doc-12.3.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dyninst-doc = ""

URI_dyninst-testsuite = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dyninst-testsuite-12.3.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dyninst-testsuite = " \
 libgcc \
 dyninst \
 libstdc++ \
 dyninst-devel \
 glibc \
 tbb \
"
