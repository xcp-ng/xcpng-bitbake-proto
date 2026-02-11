
PN = "cockpit-files"
PE = "0"
PV = "16"
PR = "1.el10"
PACKAGES = "cockpit-files"


URI_cockpit-files = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-files-16-1.el10.noarch.rpm;unpack=0"
RDEPENDS:cockpit-files = "cockpit-bridge ( >=  318)"
RPROVIDES:cockpit-files = "metainfo() ( ) metainfo(org.cockpit_project.files.metainfo.xml) ( ) bundled(npm(lodash)) ( =  4.17.21) bundled(npm(prop-types)) ( =  15.8.1) bundled(npm(js-tokens)) ( =  4.0.0) bundled(npm(loose-envify)) ( =  1.4.0) bundled(npm(object-assign)) ( =  4.1.1) bundled(npm(react-is)) ( =  16.13.1) bundled(npm(tabbable)) ( =  6.2.0) bundled(npm(attr-accept)) ( =  2.2.5) bundled(npm(file-selector)) ( =  2.1.2) bundled(npm(react)) ( =  18.3.1) bundled(npm(react-dom)) ( =  18.3.1) bundled(npm(react-dropzone)) ( =  14.3.5) bundled(npm(scheduler)) ( =  0.23.2) bundled(npm(throttle-debounce)) ( =  5.0.2) bundled(npm(tslib)) ( =  2.8.1) bundled(npm(@patternfly/patternfly)) ( =  5.4.2) bundled(npm(@patternfly/react-core)) ( =  5.4.12) bundled(npm(@patternfly/react-icons)) ( =  5.4.2) bundled(npm(@patternfly/react-styles)) ( =  5.4.1) bundled(npm(@patternfly/react-table)) ( =  5.4.14) bundled(npm(@patternfly/react-tokens)) ( =  5.4.1) bundled(npm(dequal)) ( =  2.0.3) bundled(npm(focus-trap)) ( =  7.6.2) cockpit-files ( =  16-1.el10)"
