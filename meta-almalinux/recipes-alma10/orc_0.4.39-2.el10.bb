
PN = "orc"
PE = "0"
PV = "0.4.39"
PR = "2.el10"
PACKAGES = "orc orc-compiler orc-devel orc-doc"


URI_orc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/orc-0.4.39-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:orc = " \
 glibc \
"

URI_orc-compiler = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/orc-compiler-0.4.39-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:orc-compiler = " \
 glibc \
 pkgconf-pkg-config \
 orc \
"

URI_orc-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/orc-devel-0.4.39-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:orc-devel = " \
 orc-compiler \
 pkgconf-pkg-config \
 orc \
"

URI_orc-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/orc-doc-0.4.39-2.el10.noarch.rpm;unpack=0"
RDEPENDS:orc-doc = " \
 orc \
"
