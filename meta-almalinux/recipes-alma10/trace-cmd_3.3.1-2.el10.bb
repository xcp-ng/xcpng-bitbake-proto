
PN = "trace-cmd"
PE = "0"
PV = "3.3.1"
PR = "2.el10"
PACKAGES = "trace-cmd trace-cmd-python3"


URI_trace-cmd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/trace-cmd-3.3.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:trace-cmd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) libaudit.so.1()(64bit) ( ) libzstd.so.1()(64bit) ( ) libtraceevent.so.1()(64bit) ( ) libtracefs.so.1()(64bit) ( )"
RPROVIDES:trace-cmd = "trace-cmd ( =  3.3.1-2.el10) trace-cmd(x86-64) ( =  3.3.1-2.el10)"

URI_trace-cmd-python3 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/trace-cmd-python3-3.3.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:trace-cmd-python3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/python3 ( ) libtraceevent.so.1()(64bit) ( ) libtracefs.so.1()(64bit) ( ) trace-cmd(x86-64) ( =  3.3.1-2.el10)"
RPROVIDES:trace-cmd-python3 = "trace-cmd-python3 ( =  3.3.1-2.el10) trace-cmd-python3(x86-64) ( =  3.3.1-2.el10)"
