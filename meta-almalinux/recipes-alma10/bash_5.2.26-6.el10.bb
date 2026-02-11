
PN = "bash"
PE = "0"
PV = "5.2.26"
PR = "6.el10"
PACKAGES = "bash bash-devel bash-doc"


URI_bash = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bash-5.2.26-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bash = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libtinfo.so.6()(64bit) ( ) filesystem ( >=  3)"
RPROVIDES:bash = "/bin/sh ( ) /bin/bash ( ) bash ( =  5.2.26-6.el10) bash(x86-64) ( =  5.2.26-6.el10) config(bash) ( =  5.2.26-6.el10)"

URI_bash-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bash-devel-5.2.26-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bash-devel = "/usr/bin/pkg-config ( ) bash(x86-64) ( =  5.2.26-6.el10)"
RPROVIDES:bash-devel = "bash-devel ( =  5.2.26-6.el10) bash-devel(x86-64) ( =  5.2.26-6.el10) pkgconfig(bash) ( =  5.2-release)"

URI_bash-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bash-doc-5.2.26-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bash-doc = "bash ( =  5.2.26-6.el10)"
RPROVIDES:bash-doc = "bash-doc ( =  5.2.26-6.el10) bash-doc(x86-64) ( =  5.2.26-6.el10)"
