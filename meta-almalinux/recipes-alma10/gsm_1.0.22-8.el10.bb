
PN = "gsm"
PE = "0"
PV = "1.0.22"
PR = "8.el10"
PACKAGES = "gsm gsm-devel gsm-tools"


URI_gsm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gsm-1.0.22-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gsm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:gsm = "libgsm.so.1()(64bit) ( ) gsm ( =  1.0.22-8.el10) gsm(x86-64) ( =  1.0.22-8.el10)"

URI_gsm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gsm-devel-1.0.22-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gsm-devel = "libgsm.so.1()(64bit) ( ) gsm(x86-64) ( =  1.0.22-8.el10)"
RPROVIDES:gsm-devel = "gsm-devel ( =  1.0.22-8.el10) gsm-devel(x86-64) ( =  1.0.22-8.el10)"

URI_gsm-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gsm-tools-1.0.22-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gsm-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgsm.so.1()(64bit) ( )"
RPROVIDES:gsm-tools = "gsm-tools ( =  1.0.22-8.el10) gsm-tools(x86-64) ( =  1.0.22-8.el10)"
