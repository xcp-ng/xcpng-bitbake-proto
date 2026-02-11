
PN = "file"
PE = "0"
PV = "5.45"
PR = "7.el10"
PACKAGES = "file file-libs python3-file-magic file-devel file-static"


URI_file = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/file-5.45-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:file = " \
 glibc \
 file-libs \
"

URI_file-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/file-libs-5.45-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:file-libs = " \
 glibc \
 zlib-ng-compat \
"

URI_python3-file-magic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-file-magic-5.45-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-file-magic = " \
 python3 \
 file-libs \
"

URI_file-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/file-devel-5.45-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:file-devel = " \
 file-libs \
 pkgconf-pkg-config \
"

URI_file-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/file-static-5.45-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:file-static = " \
 file-devel \
"
