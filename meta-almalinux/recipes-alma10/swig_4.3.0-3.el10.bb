
PN = "swig"
PE = "0"
PV = "4.3.0"
PR = "3.el10"
PACKAGES = "swig swig-doc swig-gdb"


URI_swig = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/swig-4.3.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swig = " \
 glibc \
 libgcc \
 pcre2 \
 libstdc++ \
"

URI_swig-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/swig-doc-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:swig-doc = ""

URI_swig-gdb = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/swig-gdb-4.3.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swig-gdb = " \
 swig \
"
