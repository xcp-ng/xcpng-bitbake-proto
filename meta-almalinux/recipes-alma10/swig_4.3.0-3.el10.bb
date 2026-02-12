
inherit dnf-bridge

PN = "swig"
PE = "0"
PV = "4.3.0"
PR = "3.el10"
PACKAGES = "swig swig-doc swig-gdb"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/swig-4.3.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_swig = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/swig-4.3.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_swig}"
RDEPENDS:swig = " \
 glibc \
 libgcc \
 pcre2 \
 libstdc++ \
"

URI_swig-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/swig-doc-4.3.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_swig-doc}"
RDEPENDS:swig-doc = ""

URI_swig-gdb = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/swig-gdb-4.3.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_swig-gdb}"
RDEPENDS:swig-gdb = " \
 swig \
"
