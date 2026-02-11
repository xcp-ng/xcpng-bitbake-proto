
PN = "satyr"
PE = "0"
PV = "0.43"
PR = "3.el10"
PACKAGES = "python3-satyr satyr satyr-devel"


URI_python3-satyr = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-satyr-0.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-satyr = " \
 python3 \
 zlib-ng-compat \
 satyr \
 json-c \
 elfutils-libelf \
 elfutils-libs \
 libstdc++ \
 glib2 \
 popt \
 glibc \
 rpm-libs \
"

URI_satyr = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/satyr-0.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:satyr = " \
 zlib-ng-compat \
 libgcc \
 json-c \
 elfutils-libelf \
 elfutils-libs \
 libstdc++ \
 glib2 \
 popt \
 glibc \
 rpm-libs \
"

URI_satyr-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/satyr-devel-0.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:satyr-devel = " \
 satyr \
 pkgconf-pkg-config \
 json-c-devel \
"
