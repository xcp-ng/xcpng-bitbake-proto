
inherit dnf-bridge

PN = "libbytesize"
PE = "0"
PV = "2.10"
PR = "5.el10"
PACKAGES = "libbytesize python3-bytesize libbytesize-devel libbytesize-tools"


URI_libbytesize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libbytesize-2.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbytesize = " \
 glibc \
 gmp \
 pcre2 \
 mpfr \
"

URI_python3-bytesize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-bytesize-2.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-bytesize = " \
 python3 \
 libbytesize \
"

URI_libbytesize-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libbytesize-devel-2.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbytesize-devel = " \
 libbytesize \
 pkgconf-pkg-config \
"

URI_libbytesize-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libbytesize-tools-2.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbytesize-tools = " \
 python3 \
 python3-bytesize \
"
