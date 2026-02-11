
PN = "json-c"
PE = "0"
PV = "0.18"
PR = "3.el10"
PACKAGES = "json-c json-c-devel json-c-doc"


URI_json-c = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/json-c-0.18-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:json-c = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:json-c = "libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libjson-c.so.5(JSONC_PRIVATE)(64bit) ( ) libjson-c.so.5(JSONC_0.15)(64bit) ( ) libjson-c.so.5(JSONC_0.16)(64bit) ( ) libjson-c.so.5(JSONC_0.17)(64bit) ( ) libjson-c.so.5(JSONC_0.18)(64bit) ( ) json-c ( =  0.18-3.el10) json-c(x86-64) ( =  0.18-3.el10)"

URI_json-c-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/json-c-devel-0.18-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:json-c-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libjson-c.so.5()(64bit) ( ) json-c(x86-64) ( =  0.18-3.el10)"
RPROVIDES:json-c-devel = "cmake(json-c) ( ) json-c-devel ( =  0.18-3.el10) json-c-devel(x86-64) ( =  0.18-3.el10) pkgconfig(json-c) ( =  0.18)"

URI_json-c-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/json-c-doc-0.18-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:json-c-doc = "json-c ( =  0.18-3.el10)"
RPROVIDES:json-c-doc = "json-c-doc ( =  0.18-3.el10) json-c-doc(x86-64) ( =  0.18-3.el10)"
