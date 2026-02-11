
PN = "cockpit"
PE = "0"
PV = "334.1"
PR = "1.el10_0"
PACKAGES = "cockpit cockpit-bridge cockpit-doc cockpit-system cockpit-ws cockpit-packagekit cockpit-storaged"


URI_cockpit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cockpit-334.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cockpit = "cockpit-bridge ( ) cockpit-ws ( ) cockpit-system ( )"
RPROVIDES:cockpit = "metainfo() ( ) metainfo(org.cockpit_project.cockpit.appdata.xml) ( ) cockpit ( =  334.1-1.el10_0) cockpit(x86-64) ( =  334.1-1.el10_0)"

URI_cockpit-bridge = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cockpit-bridge-334.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cockpit-bridge = "/usr/bin/python3 ( ) python(abi) ( =  3.12)"
RPROVIDES:cockpit-bridge = "cockpit-bridge ( =  334.1-1.el10_0) cockpit-bridge(x86-64) ( =  334.1-1.el10_0) python3.12dist(cockpit) ( =  334.1) python3dist(cockpit) ( =  334.1)"

URI_cockpit-doc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cockpit-doc-334.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cockpit-doc = ""
RPROVIDES:cockpit-doc = "cockpit-doc ( =  334.1-1.el10_0)"

URI_cockpit-system = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cockpit-system-334.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cockpit-system = "shadow-utils ( ) grep ( ) sos ( ) sudo ( ) /usr/bin/date ( ) /usr/bin/pwscore ( ) NetworkManager ( >=  1.6) cockpit-bridge ( >=  334.1-1.el10_0)"
RPROVIDES:cockpit-system = "bundled(npm(@patternfly/patternfly)) ( =  5.4.2) bundled(npm(@patternfly/react-core)) ( =  5.4.12) bundled(npm(@patternfly/react-icons)) ( =  5.4.2) bundled(npm(@patternfly/react-styles)) ( =  5.4.1) bundled(npm(@patternfly/react-table)) ( =  5.4.14) bundled(npm(@patternfly/react-tokens)) ( =  5.4.1) bundled(npm(@xterm/addon-canvas)) ( =  0.7.0) bundled(npm(@xterm/xterm)) ( =  5.5.0) bundled(npm(argparse)) ( =  1.0.10) bundled(npm(attr-accept)) ( =  2.2.5) bundled(npm(autolinker)) ( =  3.16.2) bundled(npm(dequal)) ( =  2.0.3) bundled(npm(file-selector)) ( =  2.1.2) bundled(npm(focus-trap)) ( =  7.6.2) bundled(npm(js-tokens)) ( =  4.0.0) bundled(npm(json-stable-stringify-without-jsonify)) ( =  1.0.1) bundled(npm(lodash)) ( =  4.17.21) bundled(npm(loose-envify)) ( =  1.4.0) bundled(npm(object-assign)) ( =  4.1.1) bundled(npm(prop-types)) ( =  15.8.1) bundled(npm(react)) ( =  18.3.1) bundled(npm(react-dom)) ( =  18.3.1) bundled(npm(react-dropzone)) ( =  14.3.5) bundled(npm(react-is)) ( =  16.13.1) bundled(npm(remarkable)) ( =  2.0.1) bundled(npm(scheduler)) ( =  0.23.2) bundled(npm(sprintf-js)) ( =  1.0.3) bundled(npm(tabbable)) ( =  6.2.0) bundled(npm(throttle-debounce)) ( =  5.0.2) bundled(npm(tslib)) ( =  2.8.1) bundled(npm(uuid)) ( =  11.0.5) cockpit-kdump ( =  334.1-1.el10_0) cockpit-networkmanager ( =  334.1-1.el10_0) cockpit-selinux ( =  334.1-1.el10_0) cockpit-shell ( =  334.1-1.el10_0) cockpit-sosreport ( =  334.1-1.el10_0) cockpit-system ( =  334.1-1.el10_0) cockpit-systemd ( =  334.1-1.el10_0) cockpit-tuned ( =  334.1-1.el10_0) cockpit-users ( =  334.1-1.el10_0)"

URI_cockpit-ws = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cockpit-ws-334.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cockpit-ws = "/bin/sh ( ) policycoreutils ( if  selinux-policy-targeted) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) /usr/bin/bash ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) openssl ( ) libc.so.6(GLIBC_2.39)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_221)(64bit) ( ) glib-networking ( ) libpam.so.0(LIBPAM_MODUTIL_1.1.9)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_227)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_237)(64bit) ( ) selinux-policy ( if  selinux-policy-targeted) glib2 ( >=  2.50.0)"
RPROVIDES:cockpit-ws = "cockpit-ws ( =  334.1-1.el10_0) cockpit-ws(x86-64) ( =  334.1-1.el10_0) config(cockpit-ws) ( =  334.1-1.el10_0)"

URI_cockpit-packagekit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-packagekit-334.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cockpit-packagekit = "polkit ( ) PackageKit ( ) cockpit-bridge ( >=  266)"
RPROVIDES:cockpit-packagekit = "cockpit-packagekit ( =  334.1-1.el10_0)"

URI_cockpit-storaged = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-storaged-334.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cockpit-storaged = "/bin/sh ( ) /usr/bin/python3 ( ) python3-dbus ( ) cockpit-shell ( >=  266) udisks2 ( >=  2.9)"
RPROVIDES:cockpit-storaged = "metainfo() ( ) metainfo(org.cockpit_project.cockpit_storaged.metainfo.xml) ( ) cockpit-storaged ( =  334.1-1.el10_0)"
