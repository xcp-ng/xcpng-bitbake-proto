
PN = "setroubleshoot"
PE = "0"
PV = "3.3.35"
PR = "1.el10"
PACKAGES = "setroubleshoot setroubleshoot-server"


URI_setroubleshoot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/setroubleshoot-3.3.35-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:setroubleshoot = "dbus ( ) desktop-file-utils ( ) /usr/bin/python3 ( ) python3-gobject ( ) gtk3 ( ) libnotify ( ) xdg-utils ( ) python3-dasbus ( ) python(abi) ( =  3.12) setroubleshoot-server ( =  3.3.35-1.el10)"
RPROVIDES:setroubleshoot = "metainfo() ( ) application() ( ) application(setroubleshoot.desktop) ( ) metainfo(org.fedoraproject.setroubleshoot.appdata.xml) ( ) config(setroubleshoot) ( =  3.3.35-1.el10) setroubleshoot ( =  3.3.35-1.el10) setroubleshoot(x86-64) ( =  3.3.35-1.el10)"

URI_setroubleshoot-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/setroubleshoot-server-3.3.35-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:setroubleshoot-server = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/python3 ( ) libdbus-1.so.3()(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) policycoreutils-python-utils ( ) dbus ( ) polkit ( ) python3-six ( ) python3-dbus ( ) python3-dasbus ( ) audit-libs-python3 ( ) libauparse.so.0()(64bit) ( ) rpm-python3 ( ) initscripts-service ( ) libxml2-python3 ( ) python(abi) ( =  3.12) audit ( >=  3.0.1) libselinux-python3 ( >=  2.1.5-1) python3-gobject-base ( >=  3.11) setroubleshoot-plugins ( >=  3.3.10) systemd-python3 ( >=  206-1)"
RPROVIDES:setroubleshoot-server = "group(setroubleshoot) ( ) setroubleshoot-server ( =  3.3.35-1.el10) config(setroubleshoot-server) ( =  3.3.35-1.el10) python3.12dist(setroubleshoot) ( =  3.3.33) python3dist(setroubleshoot) ( =  3.3.33) setroubleshoot-server(x86-64) ( =  3.3.35-1.el10) user(setroubleshoot) ( =  dSBzZXRyb3VibGVzaG9vdCAtICJTRUxpbnV4IHRyb3VibGVzaG9vdCBzZXJ2ZXIiIC92YXIvbGliL3NldHJvdWJsZXNob290)"
