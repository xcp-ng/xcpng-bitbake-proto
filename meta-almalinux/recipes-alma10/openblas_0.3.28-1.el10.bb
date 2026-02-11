
inherit dnf-bridge

PN = "openblas"
PE = "0"
PV = "0.3.28"
PR = "1.el10"
PACKAGES = "openblas openblas-openmp openblas-openmp64 openblas-serial openblas-devel openblas-openmp64_ openblas-serial64 openblas-serial64_ openblas-static openblas-threads openblas-threads64 openblas-threads64_"


URI_openblas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openblas-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas = ""

URI_openblas-openmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openblas-openmp-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-openmp = " \
 libgcc \
 libgfortran \
 libgomp \
 glibc \
 openblas \
"

URI_openblas-openmp64 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openblas-openmp64-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-openmp64 = " \
 libgcc \
 libgfortran \
 libgomp \
 glibc \
 openblas \
"

URI_openblas-serial = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openblas-serial-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-serial = " \
 glibc \
 openblas \
 libgfortran \
"

URI_openblas-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-devel-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-devel = " \
 openblas-openmp64_ \
 openblas-serial64 \
 openblas-serial64_ \
 openblas-threads \
 openblas-threads64 \
 openblas-threads64_ \
 openblas \
 openblas-openmp \
 openblas-openmp64 \
 openblas-serial \
 openblas-srpm-macros \
"

URI_openblas-openmp64_ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-openmp64_-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-openmp64_ = " \
 libgcc \
 libgfortran \
 libgomp \
 glibc \
 openblas \
"

URI_openblas-serial64 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-serial64-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-serial64 = " \
 glibc \
 openblas \
 libgfortran \
"

URI_openblas-serial64_ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-serial64_-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-serial64_ = " \
 glibc \
 openblas \
 libgfortran \
"

URI_openblas-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-static-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-static = " \
 openblas-devel \
"

URI_openblas-threads = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-threads-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-threads = " \
 glibc \
 openblas \
 libgfortran \
"

URI_openblas-threads64 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-threads64-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-threads64 = " \
 glibc \
 openblas \
 libgfortran \
"

URI_openblas-threads64_ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-threads64_-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-threads64_ = " \
 glibc \
 openblas \
 libgfortran \
"
