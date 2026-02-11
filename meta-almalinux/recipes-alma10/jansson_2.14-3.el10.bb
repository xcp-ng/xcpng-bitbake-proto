
PN = "jansson"
PE = "0"
PV = "2.14"
PR = "3.el10"
PACKAGES = "jansson jansson-devel jansson-devel-doc"


URI_jansson = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/jansson-2.14-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jansson = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:jansson = "libjansson.so.4()(64bit) ( ) libjansson.so.4(libjansson.so.4)(64bit) ( ) jansson ( =  2.14-3.el10) jansson(x86-64) ( =  2.14-3.el10)"

URI_jansson-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jansson-devel-2.14-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jansson-devel = "/usr/bin/pkg-config ( ) libjansson.so.4()(64bit) ( ) jansson(x86-64) ( =  2.14-3.el10)"
RPROVIDES:jansson-devel = "jansson-devel ( =  2.14-3.el10) jansson-devel(x86-64) ( =  2.14-3.el10) pkgconfig(jansson) ( =  2.14)"

URI_jansson-devel-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jansson-devel-doc-2.14-3.el10.noarch.rpm;unpack=0"
RDEPENDS:jansson-devel-doc = ""
RPROVIDES:jansson-devel-doc = "jansson-devel-doc ( =  2.14-3.el10)"
