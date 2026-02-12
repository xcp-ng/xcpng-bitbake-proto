
inherit dnf-bridge

PN = "libkdumpfile"
PE = "0"
PV = "0.5.4"
PR = "8.el10"
PACKAGES = "libkdumpfile libkdumpfile-devel libkdumpfile-doc libkdumpfile-util python3-libkdumpfile"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libkdumpfile-0.5.4-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libkdumpfile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libkdumpfile-0.5.4-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkdumpfile}"
RDEPENDS:libkdumpfile = " \
 zlib-ng-compat \
 lzo \
 snappy \
 libzstd \
 glibc \
"

URI_libkdumpfile-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libkdumpfile-devel-0.5.4-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkdumpfile-devel}"
RDEPENDS:libkdumpfile-devel = " \
 libkdumpfile-devel \
 zlib-ng-compat-devel \
 libzstd-devel \
 pkgconf-pkg-config \
 snappy-devel \
 lzo-devel \
 libkdumpfile \
"

URI_libkdumpfile-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkdumpfile-doc-0.5.4-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libkdumpfile-doc}"
RDEPENDS:libkdumpfile-doc = ""

URI_libkdumpfile-util = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkdumpfile-util-0.5.4-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkdumpfile-util}"
RDEPENDS:libkdumpfile-util = " \
 glibc \
 libkdumpfile \
"

URI_python3-libkdumpfile = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-libkdumpfile-0.5.4-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-libkdumpfile}"
RDEPENDS:python3-libkdumpfile = " \
 python3 \
 zlib-ng-compat \
 lzo \
 snappy \
 libzstd \
 glibc \
 libkdumpfile \
"
