
PN = "mpdecimal"
PE = "0"
PV = "2.5.1"
PR = "12.el10"
PACKAGES = "mpdecimal mpdecimal++ mpdecimal-devel mpdecimal-doc"


URI_mpdecimal = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mpdecimal-2.5.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpdecimal = " \
 glibc \
"

URI_mpdecimal++ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mpdecimal++-2.5.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpdecimal++ = " \
 glibc \
 mpdecimal \
 libgcc \
 libstdc++ \
"

URI_mpdecimal-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mpdecimal-devel-2.5.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpdecimal-devel = " \
 mpdecimal++ \
 mpdecimal \
"

URI_mpdecimal-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mpdecimal-doc-2.5.1-12.el10.noarch.rpm;unpack=0"
RDEPENDS:mpdecimal-doc = ""
