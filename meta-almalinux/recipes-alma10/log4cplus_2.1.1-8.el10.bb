
inherit dnf-bridge

PN = "log4cplus"
PE = "0"
PV = "2.1.1"
PR = "8.el10"
PACKAGES = "log4cplus log4cplus-devel log4cplus-static"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/log4cplus-2.1.1-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_log4cplus = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/log4cplus-2.1.1-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_log4cplus}"
RDEPENDS:log4cplus = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_log4cplus-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/log4cplus-devel-2.1.1-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_log4cplus-devel}"
RDEPENDS:log4cplus-devel = " \
 pkgconf-pkg-config \
 log4cplus \
"

URI_log4cplus-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/log4cplus-static-2.1.1-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_log4cplus-static}"
RDEPENDS:log4cplus-static = " \
 log4cplus-devel \
"
