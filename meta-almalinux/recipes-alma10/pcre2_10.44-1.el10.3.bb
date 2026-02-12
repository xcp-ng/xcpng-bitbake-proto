
inherit dnf-bridge

PN = "pcre2"
PE = "0"
PV = "10.44"
PR = "1.el10.3"
PACKAGES = "pcre2 pcre2-syntax pcre2-devel pcre2-utf16 pcre2-utf32 pcre2-static pcre2-tools"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/pcre2-10.44-1.el10.3.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pcre2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pcre2-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pcre2}"
RDEPENDS:pcre2 = " \
 glibc \
 pcre2-syntax \
"

URI_pcre2-syntax = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pcre2-syntax-10.44-1.el10.3.noarch.rpm;unpack=0"
SRC_URI += "${URI_pcre2-syntax}"
RDEPENDS:pcre2-syntax = ""

URI_pcre2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcre2-devel-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pcre2-devel}"
RDEPENDS:pcre2-devel = " \
 pkgconf-pkg-config \
 pcre2-devel \
 pcre2-utf16 \
 pcre2-utf32 \
 bash \
 pcre2 \
"

URI_pcre2-utf16 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcre2-utf16-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pcre2-utf16}"
RDEPENDS:pcre2-utf16 = " \
 glibc \
 pcre2-syntax \
"

URI_pcre2-utf32 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcre2-utf32-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pcre2-utf32}"
RDEPENDS:pcre2-utf32 = " \
 glibc \
 pcre2-syntax \
"

URI_pcre2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pcre2-static-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pcre2-static}"
RDEPENDS:pcre2-static = " \
 pcre2-devel \
"

URI_pcre2-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pcre2-tools-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pcre2-tools}"
RDEPENDS:pcre2-tools = " \
 readline \
 pcre2-utf16 \
 pcre2-utf32 \
 pcre2 \
 glibc \
"
