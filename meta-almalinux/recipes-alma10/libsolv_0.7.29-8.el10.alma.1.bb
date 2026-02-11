
PN = "libsolv"
PE = "0"
PV = "0.7.29"
PR = "8.el10.alma.1"
PACKAGES = "libsolv python3-solv libsolv-devel libsolv-tools libsolv-tools-base libsolv-demo perl-solv ruby-solv"


URI_libsolv = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsolv-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsolv = " \
 zlib-ng-compat \
 bzip2-libs \
 openssl-libs \
 libxml2 \
 libzstd \
 glibc \
 rpm-libs \
 xz-libs \
"

URI_python3-solv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-solv-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-solv = " \
 glibc \
 libsolv \
 python3 \
"

URI_libsolv-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsolv-devel-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsolv-devel = " \
 rpm-devel \
 libsolv \
 pkgconf-pkg-config \
 libsolv-devel \
"

URI_libsolv-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsolv-tools-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsolv-tools = " \
 glibc \
 libsolv \
 findutils \
 libsolv-tools-base \
"

URI_libsolv-tools-base = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsolv-tools-base-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsolv-tools-base = " \
 glibc \
 libsolv \
 rpm-libs \
"

URI_libsolv-demo = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsolv-demo-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsolv-demo = " \
 glibc \
 gnupg2 \
 libsolv \
 curl \
"

URI_perl-solv = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-solv-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-solv = " \
 libsolv \
 perl-libs \
 perl-vars \
 perl-DynaLoader \
 perl-overload \
 glibc \
 perl-Exporter \
 perl-base \
"

URI_ruby-solv = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ruby-solv-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby-solv = " \
 glibc \
 libsolv \
"
