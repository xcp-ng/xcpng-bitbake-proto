
PN = "low-memory-monitor"
PE = "0"
PV = "2.1"
PR = "12.el10"
PACKAGES = "low-memory-monitor low-memory-monitor-doc"


URI_low-memory-monitor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/low-memory-monitor-2.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:low-memory-monitor = "/bin/sh ( ) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( )"
RPROVIDES:low-memory-monitor = "low-memory-monitor ( =  2.1-12.el10) low-memory-monitor(x86-64) ( =  2.1-12.el10)"

URI_low-memory-monitor-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/low-memory-monitor-doc-2.1-12.el10.noarch.rpm;unpack=0"
RDEPENDS:low-memory-monitor-doc = "low-memory-monitor ( =  2.1-12.el10)"
RPROVIDES:low-memory-monitor-doc = "low-memory-monitor-doc ( =  2.1-12.el10)"
