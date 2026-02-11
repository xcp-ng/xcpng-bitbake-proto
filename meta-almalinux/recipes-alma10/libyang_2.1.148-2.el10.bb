
PN = "libyang"
PE = "0"
PV = "2.1.148"
PR = "2.el10"
PACKAGES = "libyang libyang-devel libyang-devel-doc libyang-tools"


URI_libyang = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libyang-2.1.148-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libyang = "
 glibc
 pcre2
"

URI_libyang-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libyang-devel-2.1.148-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libyang-devel = "
 pcre2-devel
 pkgconf-pkg-config
 libyang
"

URI_libyang-devel-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libyang-devel-doc-2.1.148-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libyang-devel-doc = "
 libyang
"

URI_libyang-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libyang-tools-2.1.148-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libyang-tools = "
 glibc
 libyang
"
