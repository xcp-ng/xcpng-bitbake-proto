
PN = "jbigkit"
PE = "0"
PV = "2.1"
PR = "31.el10"
PACKAGES = "jbigkit jbigkit-libs jbigkit-devel"


URI_jbigkit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jbigkit-2.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbigkit = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libjbig.so.2.1()(64bit) ( ) libjbig85.so.2.1()(64bit) ( ) jbigkit-libs(x86-64) ( =  2.1-31.el10)"
RPROVIDES:jbigkit = "jbigkit ( =  2.1-31.el10) jbigkit(x86-64) ( =  2.1-31.el10)"

URI_jbigkit-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jbigkit-libs-2.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbigkit-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:jbigkit-libs = "libjbig.so.2.1()(64bit) ( ) libjbig85.so.2.1()(64bit) ( ) jbigkit-libs(x86-64) ( =  2.1-31.el10) jbigkit-libs ( =  2.1-31.el10)"

URI_jbigkit-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jbigkit-devel-2.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbigkit-devel = "libjbig.so.2.1()(64bit) ( ) libjbig85.so.2.1()(64bit) ( ) jbigkit-libs(x86-64) ( =  2.1-31.el10)"
RPROVIDES:jbigkit-devel = "jbigkit-devel ( =  2.1-31.el10) jbigkit-devel(x86-64) ( =  2.1-31.el10)"
